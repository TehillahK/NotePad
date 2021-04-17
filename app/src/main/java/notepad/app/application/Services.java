package notepad.app.application;

import notepad.app.persistence.INotes;
import notepad.app.persistence.fakeDB.NotesData;

public class Services {
    private static boolean useFakeDB;
    private boolean useLocalDB;
    private static INotes notesPersistance ;
    public Services(boolean useLocalDB,boolean useFakeDB)
    {
        this.useLocalDB=useLocalDB;
        this.useFakeDB=useFakeDB;
    }

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
