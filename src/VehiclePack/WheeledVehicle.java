package VehiclePack;

public abstract class WheeledVehicle implements CheckedVehicle {
    private final String modelName;
    private final int wheelsCount;

    public WheeledVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.printf("У транспорта %s:%n", modelName);
        System.out.printf("Меняем покрышку %s штук%n", wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
