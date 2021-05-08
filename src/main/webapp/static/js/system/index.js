$(function () {
    //首页初始化index_tabs
    $("#index_tabs").tabs({})
    //end_index_tabs
    //首页菜单树index_tree
    $("#index_tree").tree({
        url: '/static/json/tree.json',
        onClick: function(node) {
            //调用方法判断节点是否是叶子节点
            var isLeaf = $('#index_tree').tree("isLeaf", node.target);
            if (!isLeaf) {
                return;
            }
            //判断当前选择的选项卡是否存在
            var exists = $("#index_tabs").tabs('exists', node.text);
            if (exists) {
                //存在,选中该选项卡
                $("#index_tabs").tabs('select', node.text);
                return;
            }
            //新建选项卡
            $("#index_tabs").tabs('add', {
                title: node.text,
                content: "<iframe width='98%' height='98%' src=" + node.url + "></iframe>",
                closable: true
            });
        }
    });
    //end_index_tree
    //首页菜单树index_tree
    $("#index_tree2").tree({
        url: '/static/json/tree2.json',
        onClick: function(node) {
            //调用方法判断节点是否是叶子节点
            var isLeaf = $('#index_tree').tree("isLeaf", node.target);
            if (!isLeaf) {
                return;
            }
            //判断当前选择的选项卡是否存在
            var exists = $("#index_tabs").tabs('exists', node.text);
            if (exists) {
                //存在,选中该选项卡
                $("#index_tabs").tabs('select', node.text);
                return;
            }
            //新建选项卡
            $("#index_tabs").tabs('add', {
                title: node.text,
                content: "<iframe width='98%' height='98%' src=" + node.url + "></iframe>",
                closable: true
            });
        }
    });
    //end_index_tree
    //首页菜单树index_tree
    $("#index_tree3").tree({
        url: '/static/json/tree3.json',
        onClick: function(node) {
            //调用方法判断节点是否是叶子节点
            var isLeaf = $('#index_tree').tree("isLeaf", node.target);
            if (!isLeaf) {
                return;
            }
            //判断当前选择的选项卡是否存在
            var exists = $("#index_tabs").tabs('exists', node.text);
            if (exists) {
                //存在,选中该选项卡
                $("#index_tabs").tabs('select', node.text);
                return;
            }
            //新建选项卡
            $("#index_tabs").tabs('add', {
                title: node.text,
                content: "<iframe width='98%' height='98%' src=" + node.url + "></iframe>",
                closable: true
            });
        }
    });
    //end_index_tree
    //首页菜单树index_tree
    $("#index_tree4").tree({
        url: '/static/json/tree4.json',
        onClick: function(node) {
            //调用方法判断节点是否是叶子节点
            var isLeaf = $('#index_tree').tree("isLeaf", node.target);
            if (!isLeaf) {
                return;
            }
            //判断当前选择的选项卡是否存在
            var exists = $("#index_tabs").tabs('exists', node.text);
            if (exists) {
                //存在,选中该选项卡
                $("#index_tabs").tabs('select', node.text);
                return;
            }
            //新建选项卡
            $("#index_tabs").tabs('add', {
                title: node.text,
                content: "<iframe width='98%' height='98%' src=" + node.url + "></iframe>",
                closable: true
            });
        }
    });
    //end_index_tree
})