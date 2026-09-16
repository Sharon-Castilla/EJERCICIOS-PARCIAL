package Subject;

import Eventos.ExamenesLaboratorio;
import Eventos.NivelSaturación;
import Observer.JefeBacteriologia;
import Observer.Observer;


public interface Subject{
    public void register();      
    public void removeObserver();
    public void NotifyObserver();
   
}

