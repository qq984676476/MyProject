define([""],function(){var e={set:function(e,n,o,t,i){var c=e+"="+encodeURIComponent(n);if(void 0!=o&&null!=o&&""!=o){0==o&&(o=5256e4);var a=new Date;a.setTime(a.getTime()+60*o*1e3),c+="; expires="+a.toGMTString()}c+=t?"; path="+t:"; path=/",i&&(c+="; domain="+i),document.cookie=c},get:function(e){var n=document.cookie.match("(?:^|;)\\s*"+e+"=([^;]*)");return n?decodeURIComponent(n[1]):null},remove:function(e,n,o){document.cookie=e+"="+(n?"; path="+n:"")+(o?"; domain="+o:"")+"; expires=Thu, 01-Jan-70 00:00:01 GMT"}};return e});