package com.cbw.dto;

import java.io.Serializable;
import java.util.Date;

public class IBSLog implements Serializable {
    private Integer logId;

    private Date logDate;

    private String logFile;

    private String logLine;

    private String logThread;

    private String logLevel;

    private String logMessage;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile == null ? null : logFile.trim();
    }

    public String getLogLine() {
        return logLine;
    }

    public void setLogLine(String logLine) {
        this.logLine = logLine == null ? null : logLine.trim();
    }

    public String getLogThread() {
        return logThread;
    }

    public void setLogThread(String logThread) {
        this.logThread = logThread == null ? null : logThread.trim();
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage == null ? null : logMessage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logDate=").append(logDate);
        sb.append(", logFile=").append(logFile);
        sb.append(", logLine=").append(logLine);
        sb.append(", logThread=").append(logThread);
        sb.append(", logLevel=").append(logLevel);
        sb.append(", logMessage=").append(logMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}