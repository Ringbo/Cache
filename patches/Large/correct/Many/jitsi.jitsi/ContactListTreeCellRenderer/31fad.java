diff --git a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
index 6122d2b..08819c4 100644
--- a/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
+++ b/src/net/java/sip/communicator/impl/gui/main/contactlist/ContactListTreeCellRenderer.java
@@ -928,8 +928,8 @@
             WebDetailsListener webDetailsListener =
                 new WebDetailsListener(treeNode, webButton, uiContact);
 
-            List<WebPageDetail> dets =
-                getWebPageDetails(uiContact, webDetailsListener, true);
+            List<URLDetail> dets =
+                getURLDetails(uiContact, webDetailsListener, true);
             if(dets != null && dets.size() > 0)
             {
                 x += addButton(webButton, ++gridX, x, false);
@@ -1533,9 +1533,9 @@
             {
                 GenericDetail d = details.next();
 
-                if(d instanceof WebPageDetail)
+                if(d instanceof URLDetail)
                 {
-                    final WebPageDetail webd = (WebPageDetail)d;
+                    final URLDetail webd = (URLDetail)d;
                     if(webd.getDetailValue() != null)
                     {
                         SwingUtilities.invokeLater(new Runnable()
@@ -1564,7 +1564,7 @@
      *                    used for check whether such detail exist
      * @return list of details or null if currently not available
      */
-    private static List<WebPageDetail> getWebPageDetails(
+    private static List<URLDetail> getURLDetails(
         UIContact uiContact,
         WebDetailsListener webDetailsListener,
         boolean returnFirst)
@@ -1574,7 +1574,7 @@
                 .getContactsForOperationSet(
                     OperationSetServerStoredContactInfo.class).iterator();
 
-        List<WebPageDetail> res = new ArrayList<WebPageDetail>();
+        List<URLDetail> res = new ArrayList<URLDetail>();
 
         boolean foundWebLink = false;
         while (contacts.hasNext())
@@ -1599,9 +1599,9 @@
             while(iter.hasNext())
             {
                 GenericDetail d = iter.next();
-                if(d instanceof WebPageDetail)
+                if(d instanceof URLDetail)
                 {
-                    final WebPageDetail webd = (WebPageDetail)d;
+                    final URLDetail webd = (URLDetail)d;
                     if(webd.getDetailValue() != null)
                     {
                         res.add(webd);
@@ -1644,8 +1644,8 @@
 
             if (contactDescriptor instanceof MetaUIContact)
             {
-                List<WebPageDetail> details =
-                    getWebPageDetails(contactDescriptor, null, false);
+                List<URLDetail> details =
+                    getURLDetails(contactDescriptor, null, false);
 
                 if(details == null)
                     return;
@@ -1670,10 +1670,10 @@
                     location.y -= 8;
 
                     List<JMenuItem> items = new ArrayList<JMenuItem>();
-                    Iterator<WebPageDetail> detailIterator = details.iterator();
+                    Iterator<URLDetail> detailIterator = details.iterator();
                     while(detailIterator.hasNext())
                     {
-                        final WebPageDetail wd = detailIterator.next();
+                        final URLDetail wd = detailIterator.next();
                         String url = wd.getDetailValue().toString();
 
                         String displayStr = url;
@@ -1927,13 +1927,13 @@
         /**
          * The links used in this button.
          */
-        private List<WebPageDetail> links;
+        private List<URLDetail> links;
 
         /**
          * Changes the links.
          * @param links
          */
-        private void setLinks(List<WebPageDetail> links)
+        private void setLinks(List<URLDetail> links)
         {
             this.links = links;
         }
@@ -1951,7 +1951,7 @@
             ExtendedTooltip tip = new ExtendedTooltip(true);
             tip.setTitle(webButton.getToolTipText());
 
-            for(WebPageDetail wd : links)
+            for(URLDetail wd : links)
             {
                 String displayStr = wd.getDetailValue().toString();
                 // do not display too long links
