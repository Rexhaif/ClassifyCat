package xyz.rexhaif.classifycat.api;


import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;


public interface ClassificationEngine {

    /**
     * Modifies input data to make it applicable to train current clsf. engine
     * @param callback to notify about ending of preprocessing
     * @param sourceId identificator of raw dataset (it should be pairs of label - document)
     * @param destId identifier to store processed dataset
     */
    void preprocessTrainingInput(Handler<AsyncResult<Void>> callback, String sourceId, String destId);

    /**
     * Evaluate training process
     * @param callback callback to notify about ending of training
     * @param trainSetId id of, optionally preprocessed, training dataset
     * @param modelId identifier to loads/store trained model
     */
    void train(Handler<AsyncResult<Void>> callback, String trainSetId, String modelId);

    /**
     *
     * @param callback
     * @param inputId
     */
    void predict(Handler<AsyncResult<List<String>>> callback, String inputId);

}
