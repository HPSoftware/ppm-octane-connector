package com.ppm.integration.agilesdk.connector.octane.model;

import com.ppm.integration.agilesdk.connector.octane.client.DateUtils;
import com.ppm.integration.agilesdk.connector.octane.client.UsernamePasswordClient;
import java.util.Date;

import net.sf.json.JSONObject;

/**
 * Created by lutian on 2016/11/28.
 */
public class Sprint extends SimpleEntity{

    public String releaseId;

    public String creationTime;

    public Date creationDateTime;

    public String lastModifiedTime;

    public Date lastModifiedDateTime;

    public Date sprintStart;

    public Date sprintEnd;

    public String sprintStartDate;

    public String sprintEndDate;

    public void ParseJsonData(JSONObject tempObj) {
        this.id = (String)tempObj.get("id");
        this.name = (String)tempObj.get("name");
        this.releaseId = WorkItem.getSubObjectItem("release", "id", tempObj);

        this.creationTime = (String)tempObj.get("creation_time");
        this.creationDateTime = DateUtils.convertDateTime(creationTime);
        this.lastModifiedTime = (String)tempObj.get("last_modified");
        this.lastModifiedDateTime = DateUtils.convertDateTime(lastModifiedTime);

        this.sprintStartDate = (String)tempObj.get("start_date");
        this.sprintEndDate = (String)tempObj.get("end_date");
        this.sprintStart = DateUtils.convertDateTime(sprintStartDate);
        this.sprintEnd = DateUtils.convertDateTime(sprintEndDate);
    }

}
