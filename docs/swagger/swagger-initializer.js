window.onload = function() {
  //<editor-fold desc="Changeable Configuration Block">

  // the following lines will be replaced by docker/configurator, when it runs in a docker-container
  window.ui = SwaggerUIBundle({
    urls: [
// AUTO-GENERATED-URLS-START
      { url:"https://me-nakade.github.io/sb-todo-list/api_design/sample_API.yaml", name:"サンプルAPI 一覧" },
      { url:"https://me-nakade.github.io/sb-todo-list/api_design/user_mng_API.yaml", name:"ユーザー管理API 一覧" },
// AUTO-GENERATED-URLS-END
    ],
    //url: "https://petstore.swagger.io/v2/swagger.json",
    dom_id: '#swagger-ui',
    deepLinking: true,
    presets: [
      SwaggerUIBundle.presets.apis,
      SwaggerUIStandalonePreset
    ],
    plugins: [
      SwaggerUIBundle.plugins.DownloadUrl
    ],
    layout: "StandaloneLayout"
  });

  //</editor-fold>
};
