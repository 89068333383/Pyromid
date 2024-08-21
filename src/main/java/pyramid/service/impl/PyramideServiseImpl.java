package pyramid.service.impl;

import org.springframework.stereotype.Service;
import pyramid.service.PyramideServise;

@Service
public class PyramideServiseImpl implements PyramideServise {

    private int massa = 50;

    @Override
    public Integer getHumanEdgeWeight(int level, int index) {

        int humanEdgeWeight = 0;
        int lenght = 0;
        for (int i = level; i > 0 ; i--) {
            for (int j = index; j >= index-lenght; j--) {
                if (j<=i) {
                    humanEdgeWeight = humanEdgeWeight + massaEl(i, j);
//                    System.out.println("i=" + i + " j=" + j + " humanEdgeWeight=" + humanEdgeWeight);
                }
            }
            if ((index - lenght > 1 ))lenght++;
        }
        return humanEdgeWeight;
    }

    public int massaEl(int level, int index) {
        int massaEl = 0;
        if (level > 1){
            if ((index>1)&&(index<=level-1)){
                massaEl = massaEl + massa/2;
            }
            massaEl = massaEl + massa/2;
        }
//        System.out.println(massaEl);
        return massaEl;
    }
    public PyramideServiseImpl() {
    }
}
