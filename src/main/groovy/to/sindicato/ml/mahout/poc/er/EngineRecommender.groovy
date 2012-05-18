package to.sindicato.ml.mahout.poc.er

import org.apache.mahout.cf.taste.eval.RecommenderBuilder
import org.apache.mahout.cf.taste.model.DataModel
import org.apache.mahout.cf.taste.recommender.Recommender

/**
 * Created with IntelliJ IDEA.
 * User: domix
 * Date: 15/05/12
 * Time: 10:15
 * To change this template use File | Settings | File Templates.
 */
class EngineRecommender {
  void recommend() {
    RecommenderBuilder recommenderBuilder = new RecommenderBuilder() {

      @Override
      Recommender buildRecommender(DataModel dataModel) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
      }
    }

  }
}
