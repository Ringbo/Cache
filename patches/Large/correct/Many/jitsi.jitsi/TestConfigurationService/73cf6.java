diff --git a/test/net/java/sip/communicator/slick/configuration/TestConfigurationService.java b/test/net/java/sip/communicator/slick/configuration/TestConfigurationService.java
index 94b2b0e..3ff4d26 100644
--- a/test/net/java/sip/communicator/slick/configuration/TestConfigurationService.java
+++ b/test/net/java/sip/communicator/slick/configuration/TestConfigurationService.java
@@ -298,7 +298,7 @@
         {
             configurationService.setProperty(propertyName, propertyValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -323,7 +323,7 @@
         {
             configurationService.setProperty(propertyName, propertyNewValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -348,7 +348,7 @@
         {
             configurationService.setProperty(propertyName, propertyValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -375,7 +375,7 @@
         {
             configurationService.setProperty(propertyName, propertyValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -399,7 +399,7 @@
         {
             configurationService.setProperty(propertyName, propertyNewValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -425,7 +425,7 @@
         {
             configurationService.setProperty(propertyName, propertyValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             fail("A PropertyVetoException came from nowhere. Exc="
                  + ex.getMessage());
@@ -445,12 +445,12 @@
         configurationService.addVetoableChangeListener(rudeVetoListener);
         configurationService.addPropertyChangeListener(pListener);
 
-        ConfigPropertyVetoExceoption exception = null;
+        ConfigPropertyVetoException exception = null;
         try
         {
             configurationService.setProperty(propertyName, propertyValue);
         }
-        catch (ConfigPropertyVetoExceoption ex)
+        catch (ConfigPropertyVetoException ex)
         {
             exception = ex;
         }
@@ -487,7 +487,7 @@
         {
             configurationService.setProperty(propertyName, propertyNewValue);
         }
-        catch (ConfigPropertyVetoExceoption ex1)
+        catch (ConfigPropertyVetoException ex1)
         {
             ex1.printStackTrace();
             fail("unexpected veto exception. message:" + ex1.getMessage());
