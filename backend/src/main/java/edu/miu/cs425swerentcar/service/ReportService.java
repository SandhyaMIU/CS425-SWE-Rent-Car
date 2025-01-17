package edu.miu.cs425swerentcar.service;

import edu.miu.cs425swerentcar.dto.ReportRequest;
import edu.miu.cs425swerentcar.entity.Report;

import java.util.List;
import java.util.Optional;

public interface ReportService {

    Report saveReport(Report newReport);

    List<Report> getAllReport();

    Optional<Report> getReportById(Long reportId);

    Report addNewReport(ReportRequest newReportRequest);

    void deleteReportById(Long reportId);

    Report updateReportById(Long reportId, ReportRequest editedReport);

}
