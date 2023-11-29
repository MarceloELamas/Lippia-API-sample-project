package api.config;
import services.addTimeEntryServices;
import services.timeEntryService;

public enum EntityConfiguration {


    TIMEUSER {
        @Override
        public Class<?> getEntityService() {
            return timeEntryService.class;
        }
    },

    ADDTIMEUSER {
        @Override
        public Class<?> getEntityService() {
            return addTimeEntryServices.class;
        }
    };

    public abstract Class<?> getEntityService();
}



