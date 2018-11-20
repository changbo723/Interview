package com.snowman.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnectionPool {

    /**
     * Connection Pool
     */
    private static List<Connection> pool;

    /**
     * Connection MAX_SIZE
     */
    private static int POOL_MAX_SIZE = 100;

    /**
     * Connection MIN_SIZE
     */
    private static int POOL_MIN_SIZE = 10;

    public DBConnectionPool() {
        initPool();
    }

    public static Connection createConn(){
        try {
            Class.forName("");
            return DriverManager.getConnection("","","");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * init pool
     */
    public void initPool(){
        if(pool != null){
            pool = new ArrayList<>();
        }

        while (pool.size() < DBConnectionPool.POOL_MIN_SIZE){
            pool.add(createConn());
            System.out.println("init pool");
        }
    }

    /**
     * get last conn
     * @return
     */
    public synchronized Connection getConn(){
        int last_index = pool.size() - 1;
        Connection connection = pool.get(last_index);
        pool.remove(connection);
        return connection;
    }

    /**
     * set connection into pool
     * @param connection
     */
    public synchronized void close(Connection connection){
        if(pool.size() >= POOL_MAX_SIZE){
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }else{
            pool.add(connection);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        int b = (str == "abc" ? 1 :3);
        System.out.println(b);

        try{
            int a = 1/0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.exit(0);
            System.out.println("1111");
            return;
        }
    }
}
