package com.dvdev.oop2.enum_example;

public enum ProcessorType implements Describable {
    BIT_32("bit-32") {
        @Override //переопределяем методы в самом енаме
        public String getDescription() {
            return "bit-32 description";
        }
    },
    BIT_64("bit-64") {
        @Override //переопределяем методы в самом енаме
        public String getDescription() {
            return "bit-64 description";
        }
    };

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

//    public abstract String getDescription(); //вынес в интерфейс

    public String getName() {
        return name;
    }
}

