package com3014.league.dao;

import com3014.league.model.Fixture;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class fixtureDAO {
    
    private List<Fixture> fixtures;
    private int num = 0;

    public fixtureDAO() {
        fixtures = new ArrayList<Fixture>();
    }
    
    /**
     * 
     * @param fixture 
     * adds the fixture to the list of fixtures present
     */
    public void fixtureAdd(Fixture fixture){
        fixture.setId(num);
        num++;
        fixtures.add(fixture);
    }

    /**
     * 
     * @return all the fixtures
     */
    public List<Fixture> getFixtures() {
        return fixtures;
    }
    
}
