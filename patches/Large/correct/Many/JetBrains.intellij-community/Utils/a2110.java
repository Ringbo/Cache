diff --git a/action-system/impl/com/intellij/openapi/actionSystem/impl/Utils.java b/action-system/impl/com/intellij/openapi/actionSystem/impl/Utils.java
index b12253b..f9ae224 100644
--- a/action-system/impl/com/intellij/openapi/actionSystem/impl/Utils.java
+++ b/action-system/impl/com/intellij/openapi/actionSystem/impl/Utils.java
@@ -15,7 +15,7 @@
 
   private Utils() {}
 
-  private static void handleUpdateException(AnAction action,Presentation presentation,Exception exc){
+  private static void handleUpdateException(AnAction action,Presentation presentation,Throwable exc){
     String id=ActionManager.getInstance().getId(action);
     if(id!=null){
       LOG.error("update failed for AnAction with ID="+id,exc);
@@ -44,7 +44,7 @@
     );
     try{
       group.update(e);
-    }catch(Exception exc){
+    }catch(Throwable exc){
       handleUpdateException(group,presentation,exc);
       return;
     }
@@ -66,7 +66,7 @@
       e1.setInjectedContext(child.isInInjectedContext());
       try{
         child.update(e1);
-      } catch(Exception exc){
+      } catch(Throwable exc){
         handleUpdateException(child,presentation,exc);
         continue;
       }
@@ -114,7 +114,7 @@
             event1.setInjectedContext(childGroup.isInInjectedContext());
             childGroup.update(event1);
           }
-          catch (Exception exc) {
+          catch (Throwable exc) {
             handleUpdateException(childGroup, factory.getPresentation(childGroup), exc);
           }
           if (!factory.getPresentation(childGroup).isVisible()) {
@@ -132,7 +132,7 @@
           event1.setInjectedContext(anAction.isInInjectedContext());
           anAction.update(event1);
         }
-        catch (Exception exc) {
+        catch (Throwable exc) {
           handleUpdateException(anAction, factory.getPresentation(anAction), exc);
         }
         if (factory.getPresentation(anAction).isVisible()) {
