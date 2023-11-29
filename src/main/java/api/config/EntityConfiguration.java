package api.config;
import services.addTimeEntryServices;
import services.timeEntryService;
import services.updateTimeEntryServices;

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
    },
    UPDATETIMEUSER {
        @Override
        public Class<?> getEntityService() {
            return updateTimeEntryServices.class;
        }
    };

    public abstract Class<?> getEntityService();
}



