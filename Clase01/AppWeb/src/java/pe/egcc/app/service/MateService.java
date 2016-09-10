package pe.egcc.app.service;

import pe.egcc.app.model.MateModel;

/**
 *
 * @author Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class MateService {
  
  public void procesar(MateModel model){
    switch(model.getOpera()){
      case "+":
        model.setRpta(model.getNum1() + model.getNum2());
        break;  
      case "-":
        model.setRpta(model.getNum1() - model.getNum2());
        break;
        
    }
  }
}
