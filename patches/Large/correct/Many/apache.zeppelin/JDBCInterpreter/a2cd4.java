diff --git a/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java b/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
index f83caf9..1080c2b 100644
--- a/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
+++ b/jdbc/src/main/java/org/apache/zeppelin/jdbc/JDBCInterpreter.java
@@ -635,7 +635,7 @@
         } catch (SQLException e) { /*ignored*/ }
       }
       getJDBCConfiguration(user).removeStatement(paragraphId);
-    } catch (Exception e) {
+    } catch (Throwable e) {
       if (e.getCause() instanceof TTransportException &&
           Throwables.getStackTraceAsString(e).contains("GSS") &&
           getJDBCConfiguration(user).isConnectionInDBDriverPoolSuccessful(propertyKey)) {
