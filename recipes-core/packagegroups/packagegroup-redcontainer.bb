SUMMARY = "Packages to build for red container"

inherit packagegroup

RDEPENDS_${PN} = " \
    apache2 \
    autoconf \
    autoconf-archive \
    automake \
    bash \
    bc \
    bison \
    bzip2 \
    ca-certificates \
    chrpath \
    cmake \
    coreutils \
    cpio \
    curl \
    diffoscope \
    dropbear \
    ed \
    ell \
    file \
    findutils \
    flex \
    gawk \
    gcc \
    gdb \
    git \
    go \
    grep \
    gzip \
    htop \
    iptables \
    json-c \
    less \
    libarchive \
    libtool \
    libxml2 \
    lighttpd \
    lsb-release \
    lsof \
    m4 \
    make \
    mariadb \
    mc \
    meson \
    mtools \
    nano \
    nasm \
    nginx \
    ninja \
    openssh \
    opkg \
    opkg-utils \
    orc \
    os-release \
    patch \
    perl \
    pigz \
    pkgconf \
    postgresql \
    python3 \
    python3-jinja2 \
    python3-numpy \
    qemu \
    quilt \
    ruby \
    rsync \
    sed \
    strace \
    subversion \
    sudo \
    squashfs-tools \
    tar \
    unzip \
    util-linux \
    valgrind \
    vim \
    wget \
    which \
    xz \
    zip \
    zstd \
"
