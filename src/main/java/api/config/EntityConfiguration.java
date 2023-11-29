package api.config;
import services.timeEntryService;

public enum EntityConfiguration {


    TIME_USER {
        @Override
        public Class<?> getEntityService() {
            return timeEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



