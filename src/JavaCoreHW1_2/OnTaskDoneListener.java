package JavaCoreHW1_2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}