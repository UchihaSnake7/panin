

create table insumo
(
    id             int auto_increment,
    descripcion    VARCHAR(100) not null comment 'La descripcion del insumo',
    fecha_creacion DATE         null,
    hora_creacion  TIME         null,
    activo         boolean      not null,
    constraint insumo_pk
        primary key (id)
)
    comment 'Tabla donde s eguardan los insumos de panin';


create table insumo_precio
(
    id                    int auto_increment comment 'La primary key',
    id_insumo             int     not null comment 'La foreign key con la tabla ínsumo',
    precio                decimal null comment 'El precio del insumo en divisa  USD',
    fecha_inicio_vigencia date    null comment 'El inicio del periodo de vigencia para el precio del insumo',
    fecha_fin_vigencia    date    null comment 'El final del periodo de vigencia para el precio del insumo',
    activo                boolean not null,
    constraint insumo_precio_pk
        primary key (id),
    constraint insumo_precio_insumo_id_fk
        foreign key (id_insumo) references insumo (id)
)
    comment 'La tabla que relaciona los insumos con el precio';


    create table categoria
(
    id              int          not null,
    descripcion     VARCHAR(100) not null,
    peso            decimal      null,
    volumen         decimal      null,
    unidades        int          null,
    longitud        decimal      null,
    unidad_especial int          null,
    constraint categoria_pk
        primary key (id)
);

create table medida
(
    id           int          not null,
    descripcion  varchar(100) not null,
    id_categoria int          not null comment 'La foreign key de la tabla categoria',
    constraint medida_pk
        primary key (id),
    constraint medida_categoria_id_fk
        foreign key (id_categoria) references categoria (id)
);

create table insumo_cantidad
(
    id        int  not null,
    id_insumo int  not null comment 'La foreign key de la tabla insumo',
    cantidad  int  not null,
    id_medida int  not null comment 'La foreign key de la tabla medida',
    fecha     date null,
    constraint insumo_cantidad_pk
        primary key (id),
    constraint insumo_cantidad_insumo_id_fk
        foreign key (id_insumo) references insumo (id),
    constraint insumo_cantidad_medida_id_fk
        foreign key (id_medida) references medida (id)
);

create table producto
(
    id                int auto_increment comment 'El primary key de la tabla producto',
    descripcion       varchar(100) not null,
    precio_produccion decimal      null comment 'El precio de produccion en $',
    precio_venta      DECIMAL      null comment 'El precio de venta estimado en $',
    constraint producto_pk
        primary key (id)
);

