package com.hzz.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 add jar /home/work/udf.jar;
 create temporary function mytest as 'test.udf.ToLowerCase';
 */
public class helloUDF extends UDF {
    public String evaluate(String s) {
        return "hello-" + s;
    }
}
