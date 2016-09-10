package pe.egcc.app.service;

import pe.egcc.app.model.SumaModel;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateService {
  
  public MateService() {
  }

  public void sumar(SumaModel model){
    model.setSuma(model.getNum1() + model.getNum2());
  }
}
