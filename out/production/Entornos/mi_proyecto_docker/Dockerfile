FROM nginx:latest

COPY --chown=nginx:nginx index_andrei.html /usr/share/nginx/html/index_andrei.html
COPY --chown=nginx:nginx index_arturo.html /usr/share/nginx/html/index_arturo.html
COPY --chown=nginx:nginx index_elena.html /usr/share/nginx/html/index_elena.html
COPY --chown=nginx:nginx gatito.jpg /usr/share/nginx/html/gatito.jpg

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
