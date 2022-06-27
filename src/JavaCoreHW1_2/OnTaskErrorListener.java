package JavaCoreHW1_2;

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String errorCause) ;
    }