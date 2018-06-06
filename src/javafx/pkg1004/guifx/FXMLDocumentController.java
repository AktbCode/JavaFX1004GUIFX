/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx.pkg1004.guifx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

/**
 *
 * @author aktbcode
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private BarChart BarChart;
    
    @FXML
    private StackedAreaChart StackChart;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       BarChart();
    StackedAreaChart();
    }
    
    
    private void BarChart(){
        String Egypt = "Egypt";
        String Lebnan = "Lebnan";
        String Moroco = "Moroco";
        
        XYChart.Series Series1 = new XYChart.Series();
        Series1.setName("Java SE");
        Series1.getData().add(new XYChart.Data(Egypt, 16000));
        Series1.getData().add(new XYChart.Data(Lebnan, 21900));
        Series1.getData().add(new XYChart.Data(Moroco, 18000));
        
        XYChart.Series Series2 = new XYChart.Series();
        Series2.setName("Java EE");
        Series2.getData().add(new XYChart.Data(Egypt, 17000));
        Series2.getData().add(new XYChart.Data(Lebnan, 12000));
        Series2.getData().add(new XYChart.Data(Moroco, 12000));
        
        XYChart.Series Series3 = new XYChart.Series();
        Series3.setName("Java ME");
        Series3.getData().add(new XYChart.Data(Egypt, 16000));
        Series3.getData().add(new XYChart.Data(Lebnan, 14900));
        Series3.getData().add(new XYChart.Data(Moroco, 12000));
        
       
        BarChart.getData().addAll(Series1,Series2,Series3);
    }
    
    private void StackedAreaChart(){
        
        XYChart.Series Series12 = new XYChart.Series();
        Series12.setName("شهر مارس");
        Series12.getData().add(new XYChart.Data(1, 4));
        Series12.getData().add(new XYChart.Data(3, 10));
        Series12.getData().add(new XYChart.Data(6, 15));
        Series12.getData().add(new XYChart.Data(9, 8));
        Series12.getData().add(new XYChart.Data(12, 5));
        Series12.getData().add(new XYChart.Data(15, 18));
        Series12.getData().add(new XYChart.Data(18, 15));
        Series12.getData().add(new XYChart.Data(21, 13));
        Series12.getData().add(new XYChart.Data(24, 19));
        Series12.getData().add(new XYChart.Data(27, 21));
        Series12.getData().add(new XYChart.Data(30, 21));
        
        
        
        XYChart.Series Series22 = new XYChart.Series();
        Series22.setName("شهر أبريل");
        Series22.getData().add(new XYChart.Data(1, 20));
        Series22.getData().add(new XYChart.Data(3, 15));
        Series22.getData().add(new XYChart.Data(6, 13));
        Series22.getData().add(new XYChart.Data(9, 12));
        Series22.getData().add(new XYChart.Data(12, 14));
        Series22.getData().add(new XYChart.Data(15, 18));
        Series22.getData().add(new XYChart.Data(18, 25));
        Series22.getData().add(new XYChart.Data(21, 25));
        Series22.getData().add(new XYChart.Data(24, 23));
        Series22.getData().add(new XYChart.Data(27, 26));
        Series22.getData().add(new XYChart.Data(31, 26));
        
        
        
        XYChart.Series Series32 = new XYChart.Series();
        Series32.setName("شهر مايو");
        Series32.getData().add(new XYChart.Data(1, 6));
        Series32.getData().add(new XYChart.Data(3, 5));
        Series32.getData().add(new XYChart.Data(6, 20));
        Series32.getData().add(new XYChart.Data(9, 15));
        Series32.getData().add(new XYChart.Data(12, 16));
        Series32.getData().add(new XYChart.Data(15, 14));
        Series32.getData().add(new XYChart.Data(18, 13));
        Series32.getData().add(new XYChart.Data(21, 16));
        Series32.getData().add(new XYChart.Data(24, 26));
        Series32.getData().add(new XYChart.Data(27, 22));
        Series32.getData().add(new XYChart.Data(31, 24));
        
        StackChart.getData().addAll(Series12,Series22,Series32);
    }    
    
}
