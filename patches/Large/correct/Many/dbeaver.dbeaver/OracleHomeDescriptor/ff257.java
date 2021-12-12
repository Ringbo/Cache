diff --git a/plugins/org.jkiss.dbeaver.oracle/src/org/jkiss/dbeaver/ext/oracle/oci/OracleHomeDescriptor.java b/plugins/org.jkiss.dbeaver.oracle/src/org/jkiss/dbeaver/ext/oracle/oci/OracleHomeDescriptor.java
index 6ec2fce..9ffb953 100644
--- a/plugins/org.jkiss.dbeaver.oracle/src/org/jkiss/dbeaver/ext/oracle/oci/OracleHomeDescriptor.java
+++ b/plugins/org.jkiss.dbeaver.oracle/src/org/jkiss/dbeaver/ext/oracle/oci/OracleHomeDescriptor.java
@@ -51,7 +51,7 @@
         this.isInstantClient = OCIUtils.isInstantClient(oraHome);
         this.oraVersion = getOracleVersion();
         if (oraVersion == null) {
-            log.warn("Unrecognized Oracle client version at " + oraHome);
+            log.debug("Unrecognized Oracle client version at " + oraHome);
         }
         this.displayName = OCIUtils.readWinRegistry(oraHome, OCIUtils.WIN_REG_ORA_HOME_NAME);
     }
