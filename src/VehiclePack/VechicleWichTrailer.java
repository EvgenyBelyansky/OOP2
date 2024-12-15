package VehiclePack;

public abstract class VechicleWichTrailer extends  MotorVehicle{
    public VechicleWichTrailer(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
