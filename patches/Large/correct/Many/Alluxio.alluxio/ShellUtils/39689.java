diff --git a/common/src/main/java/tachyon/util/ShellUtils.java b/common/src/main/java/tachyon/util/ShellUtils.java
index ab75d86..134327f 100644
--- a/common/src/main/java/tachyon/util/ShellUtils.java
+++ b/common/src/main/java/tachyon/util/ShellUtils.java
@@ -29,7 +29,7 @@
 /**
  * A base class for running a Unix command.
  */
-public class ShellUtils {
+public final class ShellUtils {
 
   private static final Logger LOG = LoggerFactory.getLogger(Constants.LOGGER_TYPE);
   /** a Unix command to set permission */
