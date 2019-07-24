package Components;

public class Tyre extends Component{

        private String make;
        private String model;

    public Tyre(String make, String model, String make1, String model1) {
        super(make, model);
        this.make = make1;
        this.model = model1;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }
}



