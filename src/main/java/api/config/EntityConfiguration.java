package api.config;
import services.timeEntryService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return timeEntryService.class;
        }
    },

    TIME_USER {
        @Override
        public Class<?> getEntityService() {
            return timeEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



