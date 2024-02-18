package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    //Couplage faible
    private IDao dao;
    @Autowired
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*23;
        return res;
    }

    //pour Injecter la variable dao un objet d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
