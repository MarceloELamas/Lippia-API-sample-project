package api.config;
import services.timeEntryService;

public enum EntityConfiguration {


    TIMEUSER {
        @Override
        public Class<?> getEntityService() {
            return timeEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



