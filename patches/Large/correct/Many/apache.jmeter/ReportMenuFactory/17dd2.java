diff --git a/src/reports/org/apache/jmeter/gui/util/ReportMenuFactory.java b/src/reports/org/apache/jmeter/gui/util/ReportMenuFactory.java
index ebd8070..f643eb1 100644
--- a/src/reports/org/apache/jmeter/gui/util/ReportMenuFactory.java
+++ b/src/reports/org/apache/jmeter/gui/util/ReportMenuFactory.java
@@ -93,7 +93,7 @@
             }
 
             initializeMenus();
-        } catch (Throwable e) {
+        } catch (Exception e) {
             log.error("", e);
         }
     }
@@ -280,7 +280,7 @@
                 } catch (NoClassDefFoundError e) {
                     log.warn("Missing jar? Could not create " + name + ". " + e);
                     continue;
-                } catch (Throwable e) {
+                } catch (Exception e) {
                     log.warn("Could not instantiate " + name, e);
                     continue;
                 }
