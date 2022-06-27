package JavaCoreHW1_2;


public class Worker implements OnTaskDoneListener, OnTaskErrorListener {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " failed");
            } else {
                callback.onDone("Task " + i + " done");
            }
        }
    }
    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String errorCause) {

    }

}