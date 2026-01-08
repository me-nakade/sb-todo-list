window.onload = function() {
  const ui = SwaggerUIBundle({
      { url: "sample_API.yaml", name: "サンプルAPI 一覧" },
      { url: "sample_B_API.yaml", name: "SAMPLE_API" },
      { url: "user_mng_API.yaml", name: "ユーザー管理API 一覧" },
    ],
    dom_id: '#swagger-ui'
  });
  window.ui = ui;
}
