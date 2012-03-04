public class Director{
    private Builder builder;
    public Director(Builder builder){
	this.builder=builder;
    }
    public void construct(){
	builder.makeTitle("Greeting");

	builder.makeString("from morning to noon");
	builder.makeItems(new String[]{"good morning","hello",});

	builder.makeString("at night");
	builder.makeItems(new String[]{"good evening","good night","good bye",});

	builder.close();
    }
}
