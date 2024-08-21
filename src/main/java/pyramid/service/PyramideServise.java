package pyramid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface PyramideServise {
    public Integer getHumanEdgeWeight(int level, int index);
//    public Integer getHumanEdgeWeight2(int level, int index);
}
