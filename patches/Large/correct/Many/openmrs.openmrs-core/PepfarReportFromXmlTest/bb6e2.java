diff --git a/api/src/test/java/org/openmrs/report/PepfarReportFromXmlTest.java b/api/src/test/java/org/openmrs/report/PepfarReportFromXmlTest.java
index 66d567b..b2dbeb6 100644
--- a/api/src/test/java/org/openmrs/report/PepfarReportFromXmlTest.java
+++ b/api/src/test/java/org/openmrs/report/PepfarReportFromXmlTest.java
@@ -133,7 +133,7 @@
 		}
 		if (Context.getReportObjectService().getPatientSearch("EnrolledOnDate") == null) {
 			PatientSearch ps = PatientSearch.createFilterSearch(ProgramStatePatientFilter.class);
-			ps.addArgument("program", hivProgram.getProgramId().toString(), Integer.class);
+			ps.addArgument("program", hivProgram.getProgramId().toString(), Program.class);
 			ps.addArgument("untilDate", "${date}", Date.class);
 			Context.getReportObjectService().saveReportObject(new PatientSearchReportObject("EnrolledOnDate", ps));
 		}
