public  class Bicycle implements Vehicle {
    private String modelName;
    private int wheelsCount;


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    @Override
    public void check() {

    }

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }

    }

    @Override
    public void check(Truck truck) {

    }

    @Override
    public void check(Car car) {

    }
}