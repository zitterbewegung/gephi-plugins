/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uic.cs.compbio.DyNSPK;

import org.gephi.statistics.spi.Statistics;
import org.gephi.statistics.spi.StatisticsBuilder;
import org.openide.util.lookup.ServiceProvider;


/**
 *
 * @author zitterbewegung
 */
@ServiceProvider(service = StatisticsBuilder.class)
public class DynamicBetweenessBuilder implements StatisticsBuilder {

    @Override
    public String getName() {
        return "Dynamic Betweeness";
    }

    @Override
    public Statistics getStatistics() {
        return new DynamicBetweeness();
    }

    @Override
    public Class<? extends Statistics> getStatisticsClass() {
        return DynamicBetweeness.class;
    }
    
}
