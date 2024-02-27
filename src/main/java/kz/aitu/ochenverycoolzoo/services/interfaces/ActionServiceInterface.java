package kz.aitu.ochenverycoolzoo.services.interfaces;
import kz.aitu.ochenverycoolzoo.models.Action;

import java.util.List;

public interface ActionServiceInterface {
    List<Action> getAll();
    Action getById(int id);
    Action create(Action action);
}
