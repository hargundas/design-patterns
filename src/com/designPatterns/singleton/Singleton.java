package com.designPatterns.singleton;


    class TestSingleton {
        // Create a static instance of the class
        private static final TestSingleton obj = new TestSingleton();

        // Private constructor to prevent instantiation from outside the class
        private TestSingleton() {
            System.out.println("Instance Created");
        }

        public static TestSingleton getInstance() {
            return obj;
        }
    }

    class MainSingleton {
        public static void main(String[] args) {
            TestSingleton obj = TestSingleton.getInstance();
            TestSingleton obj1 = TestSingleton.getInstance();
        }
    }


