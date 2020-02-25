var index = (function () {
    var _t1 = {};
    var self = {t1: _t1};

    _t1.refresh = function (no, url, $md, $camel, $lc) {
        // clear first
        $md.val('');
        $camel.val('');
        $lc.attr('data-toolkit', '/');

        if (!url) return;

        var problemName = /\/problems\/(.+)\//.exec(url)[1];
        $camel.val(tranToCamel(problemName));

        var md = '# ' + no + '. ' + problemName + '\r\n'
            + '- [' + no + '. ' + problemName + '](' + url + ')';
        $md.val(md);

        var lcUrl = 'https://leetcode.com/problems/' + problemName + '/';
        $lc.attr('data-toolkit', lcUrl);

        function tranToCamel(str) {
            var strArr = str.split('-');
            for (var i = 0; i < strArr.length; i++) {
                strArr[i] = strArr[i].charAt(0).toUpperCase() + strArr[i].substring(1).toLowerCase();
            }
            return strArr.join('');
        }
    };

    return self;
})();