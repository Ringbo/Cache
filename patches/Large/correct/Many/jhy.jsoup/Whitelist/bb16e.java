diff --git a/src/main/java/org/jsoup/safety/Whitelist.java b/src/main/java/org/jsoup/safety/Whitelist.java
index 6340c10..a0ff66b 100644
--- a/src/main/java/org/jsoup/safety/Whitelist.java
+++ b/src/main/java/org/jsoup/safety/Whitelist.java
@@ -77,7 +77,7 @@
 
     /**
      This whitelist allows a fuller range of text nodes: <code>a, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,
-     ol, p, pre, q, small, strike, strong, sub, sup, u, ul</code>, and appropriate attributes.
+     ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>, and appropriate attributes.
      <p/>
      Links (<code>a</code> elements) can point to <code>http, https, ftp, mailto</code>, and have an enforced
      <code>rel=nofollow</code> attribute.
@@ -90,7 +90,7 @@
         return new Whitelist()
                 .addTags(
                         "a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em",
-                        "i", "li", "ol", "p", "pre", "q", "small", "strike", "strong", "sub",
+                        "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub",
                         "sup", "u", "ul")
 
                 .addAttributes("a", "href")
@@ -122,7 +122,7 @@
 
     /**
      This whitelist allows a full range of text and structural body HTML: <code>a, b, blockquote, br, caption, cite,
-     code, col, colgroup, dd, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, strike, strong, sub,
+     code, col, colgroup, dd, div, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, span, strike, strong, sub,
      sup, table, tbody, td, tfoot, th, thead, tr, u, ul</code>
      <p/>
      Links do not have an enforced <code>rel=nofollow</code> attribute, but you can add that if desired.
@@ -134,7 +134,7 @@
                 .addTags(
                         "a", "b", "blockquote", "br", "caption", "cite", "code", "col",
                         "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6",
-                        "i", "img", "li", "ol", "p", "pre", "q", "small", "strike", "strong",
+                        "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong",
                         "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u",
                         "ul")
 
