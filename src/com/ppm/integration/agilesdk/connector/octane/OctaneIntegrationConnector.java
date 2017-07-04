package com.ppm.integration.agilesdk.connector.octane;

import com.ppm.integration.agilesdk.FunctionIntegration;
import com.ppm.integration.agilesdk.IntegrationConnector;
import com.ppm.integration.agilesdk.ui.*;

import java.util.Arrays;
import java.util.List;

public class OctaneIntegrationConnector extends IntegrationConnector {

    @Override public String getExternalApplicationName() {
        return "Octane Connector";
    }

    @Override public String getExternalApplicationVersionIndication() {
        return null;
    }

    @Override public String getTargetApplicationIcon() {
        return "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAYAAAA7bUf6AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAAEnQAABJ0Ad5mH3gAAAAZdEVYdFNvZnR3YXJlAEFkb2JlIEltYWdlUmVhZHlxyWU8AAACh0lEQVQ4T32TS0iUURTH/9+MM+PM+BjH15RShITUJi0wLWiTLQJp0YNq0WKioKKNZpHRItoM2EMpE4rEAQl7LCyxJFRMokEXzviKiUobw3JqtK8adfRT53TvnU/xNf0W9zvn/M85nHvvd0H/ITA9SS2+fvadUCNrI/EFa1De04KbHzsRGB9BasoGlGzOw+Wcfaq6HI36XcQVGEZa7QV4ZD/imd915CpMFManYADpzlK8++mLJC5FzMN4/2eMil5VkVR9hrzBMbrhfk3FrmdCK3U1kKO7mb5MyGS8f47l3WP5AaFxRJMXvj6KqysjBysMM19WFEp1XqQxJcRlkmcVSnZeotFQ5Gwqe9vIxPIbWR1HNDn59ilV9LaLAGdv01168MGlehHqP7upoLFS9Ygq+jvIrk4qzkSv1UIfoxXbe+7rg39mEqezC4S/wLGsXChz83gy6BE+z9dLOmEvHqxGNct7WlG967CwV1K9+xDuDLQLWxL5kYsVldxM0BnwcngAiQYj9tiyeHgVeWkbkWm2gJ0FEnWxagu1iUYjwag34kTHI9zOPyiEaNxi+qmOOuh0emg1kenFajMn4/ybOlzfVogtSelCiEZmnIVt6yjOtjphYzYnhi80P4fvob8oyt6JhhEvZsPE9rwaPr6OTZ27PhvjUhjzs4qIiyb51nUwJ6Rga/01XMk7gODMFH4r00xZ+iIkWPSxiI814XhLDeINZhRYMyKSuGjGYFAme1stWR4W04D8Q40uh8e5bm+tFfkLrHrFnYGvlFRTQoVNVeSV/SLmZcXc53GuryTqK3a4m/F4yAMrG/vX9BT72XJQtn2/qi4nahPOt1AQ3aND2GHbhAxTghpdCfAP7vjiUh3MDT4AAAAASUVORK5CYII=";
    }

    @Override public List<Field> getDriverConfigurationFields() {

        return Arrays.asList(new Field[] {new PlainText(OctaneConstants.KEY_BASE_URL, "BASE_URL", "", "", true),
                new LineBreaker(), new PlainText(OctaneConstants.KEY_PROXY_HOST, "PROXY_HOST", "", "", false),
                new PlainText(OctaneConstants.KEY_PROXY_PORT, "PROXY_PORT", "", "", false),
                new CheckBox(OctaneConstants.KEY_USE_GLOBAL_PROXY, "USE_GLOBAL_PROXY", "", false), new LineBreaker(),
                new PlainText(OctaneConstants.APP_CLIENT_ID, "CLIENT_ID", "", "", true),
                new PasswordText(OctaneConstants.APP_CLIENT_SECRET, "CLIENT_SECRET", "", "", true), new LineBreaker()});
    }

    /**
     * This is needed for keeping the Octane connector backward compatible with PPM 9.41.
     */
    @Override public List<FunctionIntegration> getIntegrations() {
        return Arrays
                .asList(new FunctionIntegration[] {new OctaneWorkPlanIntegration(), new OctaneTimeSheetIntegration()});
    }

    @Override public List<String> getIntegrationClasses() {
        return Arrays
                .asList(new String[] {"com.ppm.integration.agilesdk.connector.octane.OctaneWorkPlanIntegration","com.ppm.integration.agilesdk.connector.octane.OctaneTimeSheetIntegration", "com.ppm.integration.agilesdk.connector.octane.OctaneAgileDataIntegration", "com.ppm.integration.agilesdk.connector.octane.OctanePortfolioEpicIntegration"});
    }

    @Override public String getConnectorVersion() {
        return "1.0";
    }

}
