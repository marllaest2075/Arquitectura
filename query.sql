CREATE DATABASE [Arquitectos]

GO
Use Arquitectos
GO

create Table [Empleado]
(
[Id] Integer Not Null,
[Nomina] varchar not null,
[Telefono] varchar null,
[Nombre] varchar null,
[Correo] varchar null,
[IsBoss] bit,
[IdProyecto] integer not null,
Primary Key([Id]) 
)
GO

Create Table [Usuario](
[Id] Integer Not Null,
[Usuario] varchar not null,
[Contraseña] varchar not null,
[IdEmpleado] integer null,
Primary Key([Id]),
foreign key (IdEmpleado) REFERENCES Empleado(Id)  
)
GO

Create Table [Cliente]
(
[Id] Integer Not Null,
[Nombre] varchar not null,
[Telefono] varchar null,
[IsPerson] bit,
[Correo] varchar null,
[TieneAporte] bit,
[Aporte] money,
Primary Key([Id]) 
)
GO

create table[TipoProyecto]
([Id] Integer NOT NULL,
[nombre] Char (30) NULL,
Primary Key ([Id])
)
GO

Create table [Proyecto]
(
[Id] Integer NOT NULL,
[nombre] Char (30) NULL,
[IsPresupuesto] bit,
[presup] Money NULL,
[residen] Char (100) NULL,
[Tipo] integer not null,
[IdCliente] integer not null,
[IdJefe] integer not null,
Primary Key ([Id]),
foreign key (Tipo) REFERENCES TipoProyecto(Id),
foreign key (IdCliente) REFERENCES Cliente(Id),
foreign key (IdJefe) REFERENCES Empleado(Id)
) 
GO

ALTER TABLE [dbo].[Empleado]  WITH CHECK ADD FOREIGN KEY([IdProyecto])
REFERENCES [dbo].[Proyecto] ([Id])
GO

