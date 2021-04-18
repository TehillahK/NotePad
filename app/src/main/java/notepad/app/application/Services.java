package notepad.app.application;

import notepad.app.persistence.INotes;
import notepad.app.persistence.fakeDB.NotesData;

public class Services {
    private static boolean useFakeDB=true;
    private boolean useLocalDB;
    private static INotes notesPersistance ;



    public static synchronized INotes getNotesPersistance()
    {
        if(notesPersistance == null){
            if(useFakeDB)
            {
                notesPersistance=new NotesData();
            }
        }
        return notesPersistance;
    }

}
