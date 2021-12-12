diff --git a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
index 27f9687..c7b91ae 100644
--- a/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
+++ b/graylog2-server/src/main/java/org/graylog2/rest/resources/search/SearchResource.java
@@ -115,7 +115,7 @@
                 return searches.fieldStats(field, query, filter, timeRange, true, true);
             } catch (Searches.FieldTypeException e1) {
                 LOG.error("Retrieving field statistics for field {} failed while calculating the cardinality. Cause: {}", field, ExceptionUtils.getRootCauseMessage(e1));
-                throw new BadRequestException();
+                throw new BadRequestException("Field " + field + " is not of a numeric type and the cardinality could not be calculated either.", e1);
             }
         }
     }
