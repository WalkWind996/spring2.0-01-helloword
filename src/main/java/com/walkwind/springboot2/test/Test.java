package com.walkwind.springboot2.test;

import com.walkwind.springboot2.singleton.Singleton3;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @Program: spring2.0-01-helloword
 * @ClassName: Test
 * @Description:
 * @Author: 邢风
 * @Version:
 * @Create: 2021-03-23 11:22
 **/
public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton3> callable = new Callable<Singleton3>() {
            @Override
            public Singleton3 call() throws Exception {
                return Singleton3.getSINGLETON3();
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0 ; i <10;i++){
            Future<Singleton3> submit = executorService.submit(callable);
            objects.add(submit.get());
        }
        System.out.println(objects.toString());
      /*  int i = 1;
        i = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
*/
/*
        Stream<Double> stream4 = Stream.generate(Math::random).limit(4);
        stream4.forEach(System.out::println);
*/

    }

    static class TestClass {
        private static int showSum(int x, int y, TestMethod testMethod) {
            int sum = testMethod.sum(x, y);
            return sum;
        }
    }
}